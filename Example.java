class Example {
    int value;

    void setValue(int value) {
        this.value = value; // 'this.value' refers to the instance variable, 'value' refers to the local variable
    }

    void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.setValue(5);
        obj.display();
    }
}
