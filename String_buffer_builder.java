/*String buffer and builder methods

Key Methods in StringBuffer and String Builder 

Category	         ---         Methods

Append/Insert	     ---         append(), insert()
Modify content	     ---         replace(), delete(), deleteCharAt()
Reverse	             ---         reverse()
Capacity & Length	 ---         length(), capacity(), ensureCapacity(), trimToSize()
Access Characters	 ---         charAt(), setCharAt()
Substring/Convert	 ---         substring(), toString()

*/ 




public class String_buffer_builder {
   public static void main(String[] args) {

        // ---------- 1. Creating StringBuffer ----------
        StringBuffer sb = new StringBuffer("Hello"); 
        //StringBuilder sbd = new StringBuilder("Hello World"); // methods are similar its just the buffer is replaced by builder 

        // ---------- Append ----------
        sb.append(" Java");  // Adds text at the end
        System.out.println("After append: " + sb);

        // ---------- Insert ----------
        sb.insert(6, "Beautiful"); // Inserts text at index 6
        System.out.println("After insert: " + sb);

        // ---------- Replace ----------
       // sb.replace(6, 16, "Amazing"); // Replace part of string
        sb.replace(6,15, "Amazing " );
        System.out.println("After replace: " + sb);

        // ---------- Delete ----------
        sb.delete(6, 13); // deletes characters from index 6 to 12
        System.out.println("After delete: " + sb);

        // ---------- Delete a single character ----------
        sb.deleteCharAt(0); // delete first character
        System.out.println("After deleteCharAt: " + sb);

        // ---------- Reverse ----------
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse(); // reverse it back to normal

        // ---------- Length & Capacity ----------
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity()); // default = 16 + length

        sb.ensureCapacity(50); // ensures minimum capacity
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

        sb.trimToSize(); // trims unused memory
        System.out.println("Capacity after trimToSize: " + sb.capacity());

        // ---------- Access Characters ----------
        System.out.println("charAt(1): " + sb.charAt(1));

        sb.setCharAt(1, 'A'); // modify a character
        System.out.println("After setCharAt: " + sb);

        // ---------- Substring ----------
        System.out.println("substring(1,4): " + sb.substring(1, 4));

        // ---------- Converting to String ----------
        String finalStr = sb.toString();
        System.out.println("Converted to String: " + finalStr);
    }
    }

