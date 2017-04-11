package com.huihui.jdbc;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

import com.huihui.util.ResultObjectBuilder;

public abstract class ObjectBuilder<T> implements ResultObjectBuilder<T> {
    final Type _type;

    protected ObjectBuilder() {
        Type superClass = super.getClass().getGenericSuperclass();
        // if (superClass instanceof Class) {
        // throw new IllegalArgumentException(
        // "Internal error: TypeReference constructed without actual type information");
        // }

        this._type = ((java.lang.reflect.ParameterizedType) superClass).getActualTypeArguments()[0];
    }

    public Type getType() {
        return this._type;
    }

    
    @Override
    @SuppressWarnings("unchecked")
    public T build(ResultSet rs) throws SQLException {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            Class<T> tt = (Class<T>) this._type;
            T tmp = tt.newInstance();
            Method[] methods = tt.getDeclaredMethods();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                String columnLabel = metaData.getColumnLabel(i);
                String setterName = "set" + columnLabel;
                try {
                    for (Method m: methods) {
                        if (setterName.equalsIgnoreCase(m.getName())) {
                            Class<?>[] parameterTypes = m.getParameterTypes();
                            if (parameterTypes.length > 0) {
                                Class<?> clazz = parameterTypes[0];
                                if (clazz == Integer.class || clazz == int.class) {
                                    m.invoke(tmp, rs.getInt(i));
                                } else if (clazz == String.class) {
                                    m.invoke(tmp, rs.getString(i));
                                } else if (clazz == Long.class || clazz == long.class) {
                                    m.invoke(tmp, rs.getLong(i));
                                } else if (clazz == Boolean.class || clazz == boolean.class) {
                                    m.invoke(tmp, rs.getBoolean(i));
                                } else if (clazz == Date.class || clazz.isAssignableFrom(Date.class) ) {
                                    m.invoke(tmp, rs.getTimestamp(i));
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return tmp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
