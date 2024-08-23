class Reference {
    int x;

    void changeObject(Reference obj) {
        obj.x = 20;
    }

    void changePrimitive(int x) {
        x = 20;
    }

    public static void main(String[] args) {
        Reference obj = new Reference();
        obj.x = 10;

        System.out.println("Before changeObject: " + obj.x);
        obj.changeObject(obj);
        System.out.println("After changeObject: " + obj.x);

        int y = 10;
        System.out.println("Before changePrimitive: " + y);
        obj.changePrimitive(y);
        System.out.println("After changePrimitive: " + y);
    }
}
