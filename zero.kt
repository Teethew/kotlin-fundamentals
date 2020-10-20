fun main() {
    //simple comment
   
    /*
      multi-line
      comment
    */
     
    // memory adresses: can be variables or constants
    
    // declaring variables
    var age = 18;
    var height = 1.74;
    
    println(age);
    
    // declaring constants
    val bloodType = "O+";
    val cpf = "123456789-11";
    
    println(bloodType);
    //bloodType = "A+";
    println(cpf);
    
    // primitive types:
    // Integer: Byte, Short, Int and Long
    var sons = 0;
    // Decimal: Float and Double
    var weight = 66.5;
    // Character: Char
    var gender = 'm';
    // Boolean: Boolean
    var married = false;
    
    // not primitive types:
    // String
    var firstName = "Thiago";
    
    // declaring variables with type inference
    val language = "Kotlin"; // String
    val letter = 'z'; // Char
    val year = 2000; // Integer -> Int
    val distance = 999999999999999L; // Integer -> Long
    val temperature = 25.6; // Decimal -> Double
    val average = 5.5f; // Decimal -> Float
    
    // declaring variables with explicit type
    val valor: Float = 4.0f;
    val lastName : String = "Crispim";
    val character: Char = 'C';
    
    var name = firstName + " " + lastName;
    println(name);
    
    // template strings
    var sentence: String = "$firstName $lastName is $age years old and weights $weight kg";
	println(sentence);
}