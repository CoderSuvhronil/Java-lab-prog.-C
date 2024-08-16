class ExecutionOrder {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    ExecutionOrder() {
        System.out.println("Constructor");
    }

    void localBlock() {
        {
            System.out.println("Local Block");
        }
    }

    public static void main(String[] args) {
        ExecutionOrder eo = new ExecutionOrder();
        eo.localBlock();
    }
}
