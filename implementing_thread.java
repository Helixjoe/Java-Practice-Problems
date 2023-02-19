

class T implements Runnable
{
    public void run(){
        Thread g = new Thread();
        for(int i=0;i<3;i++){
            System.out.println(g.getName()+":"+i);
        }
    }
}

class Tsynch{
    public static void main(String arg[]){
        T t = new T();
        Thread th1 = new Thread(t);
        Thread th2 = new Thread(t);
        th1.start();
        th2.start();
    }
}
