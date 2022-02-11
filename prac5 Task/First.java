package prac5;
// Нетерпеливая инициализация
//При активной инициализации экземпляр одноэлементного класса создается во время загрузки класса,
// это самый простой способ создания одноэлементного класса, но у него есть недостаток, заключающийся в том, что экземпляр создается,
// даже если клиентское приложение может его не использовать.
//Если ваш одноэлементный класс не использует много ресурсов, следует использовать именно этот подход.
// Но в большинстве сценариев одноэлементные классы создаются для таких ресурсов, как Файловая система, подключения к базе данных и т.д.
// Мы должны избегать создания экземпляра до тех пор, пока клиент не вызовет метод getInstance . Кроме того, этот метод не предоставляет никаких опций для обработки исключений.
public class First {
    private static final First instance = new First();
    //private constructor to avoid client applications to use constructor
    private First(){}
    public static First getInstance(){
            return instance;
        }

}
