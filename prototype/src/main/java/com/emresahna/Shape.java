package com.emresahna;

public abstract class Shape implements Cloneable {
    protected String name;

    abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Shape)) return false;
        Shape shape = (Shape) obj;
        return shape.name.equals(this.name);
    }
}
