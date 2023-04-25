class FactorialException extends Exception {
    private int num;

    public FactorialException(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "FactorialException: " + num + " is out of range (0-15)";
    }
}