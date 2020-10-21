fun main() {
    // for loop
    for( i in 0..10) {
        if (i % 2 == 0)
            println(i);
        else 
            println("PLIM!");
    }

    // Lists
    // declaring a List
    var teachers = arrayListOf(
        "Davi",
        "Kaory",
        "Raul"
    );

    // printing a List
    println(teachers);

    // retrieving only an item of the List
    println(teachers[1]);

    // adding itens to a List
    teachers.add("Moisés");
    println(teachers);

    // removing an item: array.removeAt(index)
    teachers.removeAt(1);
    println(teachers);

    // getting a random item from a List
    println(teachers.random());

    // iterating over a List with the for loop
    for (name in teachers) {
        println("Teacher $name");
    }

    // List length
    println(teachers.size);
}