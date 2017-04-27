

public class Main {

    public static void main(String[] args) {

        MyList<String> linkedList=new MyList<String>();
        //checking if the list is empty
        System.out.println("***********************");
        System.out.println("Checking the empty list :");
        System.out.println("head "+linkedList.head.getData());
        System.out.println("is empty "+linkedList.isEmpty());
        System.out.println("has elements "+linkedList.hasElements());
        //adding a element
        linkedList.add("lashan");
        System.out.println("***********************");
        System.out.println("checking after adding a element :");
        System.out.println("head "+linkedList.head.getData());
        System.out.println("After Adding a element with data "+linkedList.head.getData());
        System.out.println("is empty "+linkedList.isEmpty());
        System.out.println("has element "+linkedList.hasElements());

        //adding another element
        linkedList.add("naruto");
        System.out.println("***********************");
        System.out.println("Checking after adding another element :");
        System.out.println("head "+linkedList.head.getData());
        System.out.println("After Adding a element with data "+linkedList.previous.getData());
        System.out.println("is empty "+linkedList.isEmpty());
        System.out.println("has element "+linkedList.hasElements());

        //removing the head

        linkedList.remove();
        System.out.println("***********************");
        System.out.println("Checking after removing the head :");
        System.out.println("head "+linkedList.head.getData());

                //adding another element
        linkedList.add("itachi");
        System.out.println("***********************");
        System.out.println("Checking after adding another element :");
        System.out.println("head "+linkedList.head.getData());
        System.out.println("After Adding a element with data "+linkedList.previous.getData());
        System.out.println("is empty "+linkedList.isEmpty());
        System.out.println("has element "+linkedList.hasElements());

    }
}
