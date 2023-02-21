package com.Ritesh.Access;

public class ObjectDemo {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
