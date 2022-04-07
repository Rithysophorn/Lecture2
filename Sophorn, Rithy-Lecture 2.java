class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");

        //Name: Rithy Sophorn
        
        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?

        // An arrayList is used to store sized collection of elements. Elements inside the arrayList can be added or removed when needed. An array is a fixed length data structure that hold values of the same type.

        // Put your answer for #3 here:
        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?

        /*
        import java.util.ArrayList;
        class Main {
            public static void main(String[] args) {
                ArrayList<String> elements = new ArrayList <> ();
                elements.add("It");
                elements.add("was");
                elements.add("a");
                elements.add("stormy");
                elements.add("night");
                System.out.println(elements);
            }
        }
        */
        //The side of the list is 5 elements. The type of the ArrayList is a String. 

        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]

        /*
        import java.util.ArrayList;
        class Main {
            public static void main(String[] args) {
                ArrayList<String> elements = new ArrayList <> ();
                elements.add("It");
                elements.add("was");
                elements.add("a");
                elements.add("dark");
                elements.add("and");
                elements.add("stormy");
                elements.add("night");
                System.out.println(elements);
            }
        }
        */

        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]

        /*
        import java.util.ArrayList;
        class Main {
            public static void main(String[] args) {
                ArrayList<String> elements = new ArrayList <> ();
                elements.add("It");
                elements.add("IS");
                elements.add("a");
                elements.add("dark");
                elements.add("and");
                elements.add("stormy");
                elements.add("night");
                System.out.println(elements);
            }
        }
        */

        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.

        /*
        import java.util.ArrayList;
        class Main {
            public static void main(String[] args) {
                int n = 10;
                ArrayList <Integer> elements = new ArrayList <> (n);
                for (int i = 0; i<=n; i++){
                    elements.add(i*2);
                }
                System.out.print(elements);
            }
        }
        */

        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.

        /*
        import java.util.ArrayList;
        class Main {
            public static void main(String[] args) {
                ArrayList<String> elements = new ArrayList <> ();
                elements.add("It");
                elements.add("IS");
                elements.add("a");
                elements.add("dark");
                elements.add("and");
                elements.add("stormy");
                elements.add("night");
                System.out.println(elements);
                if (elements.contains("IS")) {
                    System.out.println("There is IS in the ArrayList");
                } else {
                    System.out.println("There is no IS in the ArrayList");
                }
            }
        }
        */

        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.

        // A wrapper class is a class where the object contains primitive data types. Primitive data types example are char, int, double... while wrapper classes are Charater, Integer, Double... respectively. We can call method on Wrapper classes but we can't call methods on primitive data types since it is not an object. 
        
        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.
        
        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        //Because the int in the ArrayList<int> suppose to be <Integer> not int. 

        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // A. [2, 6, 1, 8]
        // B. [30, 20, 10, 60, 50, 40]
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]

        /*
        import java.util.ArrayList;
        class Main {
            public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList <> ();
                list.add(2);
                list.add(6);
                list.add(1);
                list.add(8);
                mystery1(list);
            }
            public static void mystery1(ArrayList<Integer> list) {
                for (int i = list.size() - 1; i > 0; i--) {
                    if (list.get(i) < list.get(i - 1)) {
                        int element = list.get(i);
                        list.remove(i);
                        list.add(0, element);
                    }
                }
                System.out.println(list);
            }
        }

        
         A. OUTPUT: [1, 2, 6, 8]
         B. OUTPUT: [10, 30, 40, 20, 60, 50]
         C. OUTPUT: [-4, 1, 25, 4, 16, 9, 64, 36, 49]

        */
    }
}
