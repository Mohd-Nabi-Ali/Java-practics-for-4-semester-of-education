package prac5;
//Этот метод создания одноэлементного класса в Java похож на метод активной инициализации.
// Единственное отличие состоит в том, что экземпляр для этого класса создается в статическом блоке с функцией обработки исключений
public class Second {
    private static Second instance;
    private Second(){}
    static{
        try{
            instance = new Second();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static Second getInstance(){
        return instance;
    }
}
