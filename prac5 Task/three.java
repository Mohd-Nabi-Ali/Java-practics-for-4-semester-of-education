package prac5;
//Самый простой способ создать потокобезопасный одноэлементный класс-синхронизировать метод глобального доступа ,
// чтобы только один поток мог выполнять этот метод одновременно. Общая реализация этого подхода аналогична приведенному ниже классу.
/*public class Singleton {
 private Singleton instance;
 public synchronized Singleton getInstance() {
 if(instance == null) {
 instance = new Singleton();
 return instance;
 }
 return instance;
 }
}
*/


/////////////////////////////
//Вышеописанная реализация отлично работает и обеспечивает потокобезопасность, но снижает производительность из-за затрат,
// связанных с синхронизированным методом, хотя она нужна нам только для первых нескольких потоков, которые могут создавать
// отдельные экземпляры (Читайте: Синхронизация Java ). Чтобы избежать этих дополнительных накладных расходов каждый раз,
// используется принцип двойной проверки блокировки . При таком подходе синхронизированный блок используется внутри условия if с дополнительной проверкой,
// чтобы убедиться, что создан только один экземпляр одноэлементного класса.
public class three {
    private static three INSTANCE = null;
    private three() {}
    public static three getInstance() {
        if (INSTANCE == null) {
            synchronized (three.class) {
                if (INSTANCE == null) {
                    INSTANCE = new three();
                }
            }
        }
        return INSTANCE;
    }
}
