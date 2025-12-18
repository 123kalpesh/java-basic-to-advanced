class methodoverloadingex{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;

    }
    public static void main(String[] args) {
        System.out.println("add()with 2 parameter");
    }
}