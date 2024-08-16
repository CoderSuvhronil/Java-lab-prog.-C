class Rectangle {
    float length;
    float width;

    void setLength(float length) {
        this.length = length;
    }

    void setWidth(float width) {
        this.width = width;
    }

    float perimeter() {
        return 2 * (length + width);
    }

    float area() {
        return length * width;
    }

    void show() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    boolean isSameArea(Rectangle r) {
        return this.area() == r.area();
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setLength(5);
        r1.setWidth(2.5f);
        r2.setLength(5);
        r2.setWidth(18.9f);

        r1.show();
        System.out.println("Area: " + r1.area() + ", Perimeter: " + r1.perimeter());
        r2.show();
        System.out.println("Area: " + r2.area() + ", Perimeter: " + r2.perimeter());

        if (r1.isSameArea(r2)) {
            System.out.println("Rectangles have the same area.");
        } else {
            System.out.println("Rectangles do not have the same area.");
        }

        r1.setLength(15);
        r1.setWidth(6.3f);

        r1.show();
        System.out.println("Area: " + r1.area() + ", Perimeter: " + r1.perimeter());
        r2.show();
        System.out.println("Area: " + r2.area() + ", Perimeter: " + r2.perimeter());

        if (r1.isSameArea(r2)) {
            System.out.println("Rectangles have the same area.");
        } else {
            System.out.println("Rectangles do not have the same area.");
        }
    }
}
