# Втора лабораториска вежба по Софтверско инженерство

## Теона Радеска, бр. на индекс 171075

### Група на код: 

Ја добив групата на код 1

###  Control Flow Graph
<img src= "Untitled Diagram.png">

Фотографија од control flow graph-ot 

### Цикломатска комплексност

Цикломатската комплексност на овој код е 7, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=6, па цикломатската комплексност изнесува 7.

### Тест случаи според критериумот  Every branch 
@Test
   
      void testEveryBranch() {
        User user = null;
        assertFalse(siLab2.function(user, createAllUsers()));

        user = new User("Tea","test","tea@asd.com");

        assertTrue(siLab2.function(user, createAllUsers("Maja","Borce")));

        user = new User(null,"test","tea@sdg.com");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","teaasdcom");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

    }

### Тест случаи според критериумот Every path

@Test
    
    void testEveryPath() {
        User user = null;
        assertFalse(siLab2.function(user, createAllUsers()));

        user = new User("Tea","test","tea@asd.com");

        assertTrue(siLab2.function(user, createAllUsers("Maja","Borce")));

        user = new User(null,"test","tea@sdg.com");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","teaasdcom");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","tea@asdcom");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","teaasd.com");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));


    } 

### Објаснување на напишаните unit tests

Every Branch: Користиме 4 теста за да ги поминеме сите гранки во графот. Графот има 17 гранки. За првиот тест земаме дека user=null и со тоа успеваме да ја поминеме A-К гранката. За вториот тест земаме променливи така што сите услови во задачата ќе ни се исполнети, па се врват гранките: A-B, B-C, C-D1, D1-D2, D2-E, E-F, F-G, G-H, H-D3, D3-D2, D2-I, I-J. За третиот тест User-от ни е валиден но имаме грешка во другиот влез, па ќе се поминат: A-B, B-K. Четвртиот тест ги има потребните влезови, но email адресата нема '@' и '.' ,  па се поминуваат: A-B, B-C, C-D1, D1-D2, D2-E, E-G, G-D3,D3-D2, D2-I, I-K.  

Every Path: Најпрво ги користиме истите 4 теста како во Branch тестирањето. Со првиот тест ќе го поминеме патот A-K. Со вториот: A-B-C-D1-(D2-E-G-H-D3-D2)-I-J. Со третиот: А-B-К. Со четвртиот: A-B-C-D1-(D2-E-G-D3-D2)-I-K. Затоа што имаме уште непоминати патеки правиме уште два теста. Петтиот е кога грешката е во email адресата, т.е кога не содржи '@', па изминатиот пат ќе биде: A-B-C-D1-(D2-E-G-H-D3-D2)-I-K. И шестиот тест каде што email адресата не содржи '.' ќе го помине патот: A-B-C-D1-(D2-E-F-G-D3-D2)-I-K.
