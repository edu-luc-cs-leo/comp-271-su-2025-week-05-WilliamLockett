/**
 * Object adjusts the size of underlying array to accommodate any number of new
 * elements added to it. The class is written as generic.
 */
public class DynamicArray {

    private static final int DEFAULT_SIZE = 4;
    private static final int RESIZE_FACTOR = 2;

    /** The underlying array of the data structure */
    private String[] underlying;
    /** How many elements have been added to the underlying array */
    private int occupancy;

    /** Basic constructor */
    public DynamicArray(int size) {
        // Guard statement here to ensure that the user-provided size is legit.
        if (size < 1) {
            size = DEFAULT_SIZE;
        }
        // Create an Object array of the requested size, then cast it
        // as an array of objects E
        this.underlying = new String[size];
        // At the beginning the underlying array is empty
        this.occupancy = 0;
    } // basic constructor

    /** Default constructor */
    public DynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /**
     * Resize the underlying array as needed.
     * 
     * @param resize_by int factor multiply the size of the underlying array
     */
    private void resize() {
        // Create temporary array of DOUBLE the size of the underlying array
        String[] temp = new String[2 * this.underlying.length];
        for (int i = 0; i < this.underlying.length; i++) {
            temp[i] = this.underlying[i];
        }
        this.underlying = temp;
    } // method resize

    public void add(String string) {
        // Is there room in the underlying array?
        if (this.occupancy == this.underlying.length) {
            this.resize();
        }
        // At this point there is guaranteed room in the array, either
        // because we just doubled it in size or because there was enough
        // room for one more element to begin with.
        this.underlying[this.occupancy] = string;
        this.occupancy++;
    } // method add

    /**
     * method to find the position of an element in the underlying array
     * 
     * @return -1 if string not present, otherwise underlying array position of
     *         first occurrence of string.
     */
    public int indexOf(String string) {
        int index = -1; // sets index to -1
        for (int i = 0; i < this.occupancy; i++) {
            //the for loop itterates through the array
            if(this.underlying[i].equals(string)){
                index = i; 
                i = this.occupancy;
                /*
                 * the if statement is for if i finds a match then
                 * i is stored in index
                 * and i becomes occupancy and exits the loop
                 */
                
            }
        }
        return index; // returns what is found or -1
    } // method indexOf

    /** Method to tell if a string exists in the underlying array */
    public boolean contains(String string) {
        boolean stringExists = false; //set to false for if nothing is found
        if(indexOf(string) != -1){ // if indexOf does not return its set value of -1,
                                   // then stringExists is true
            stringExists = true;
        }
        return stringExists;
    }

    /** Method to count how many times a string appears in the underlying array*/
    public int countOf(String string) {
        int countNum = 0; 
        for (int i = 0; i < this.occupancy; i++) {
            // for loop iterates through the array 
            if(this.underlying[i].equals(string)){
                countNum++;
            }
            // if a match is found then countNum goes up.
        }
        return countNum;
    }

    /** method to remove items from the underlying array */
    public String remove(int index) {
        return "James on the street talking trash about your hotel";
    }

    /** overload remove */ 
    public String remove(String string) {
        return "James on the street talking trash about your hotel";
    }

    /** Complete this method */
    public String toString() {
        return "to be done shortly"; // blatant violation of magic values clause
                                     // serves as reminder to finish this method
    }

} // class DynamicArray