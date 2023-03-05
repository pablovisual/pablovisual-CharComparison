public class CharComparison {
    /*
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b) {
      /*//check if both are empty, return 0 bc they're equal
      if(a.length == 0 && b.length == 0)
        return 0;

      //check if a is empty or a[0] < b[0]
      if(a.length == 0 || a[0] < b[0])
        return -1;

      //same but with b array
      if(b.length == 0 || a[0] > b[0])
        return 1;

      //check if size a < size b
      if(a.length < b.length) {
        //if checks, then loop through b array
        for(int index = 0; index < b.length; ++index) {
          //return -1 if index is at the end of array a and
          //a[index] < b[index]
          if(index == a.length - 1 && a[index] < b[index])
            return -1;

          //return 1 if index is at the end of array a and
           //[index] > b[index]
          else if(index == a.length - 1 && a[index] > b[index])
            return 1;

          //return -1 if index goes pass size a
          else if(index > a.length - 1)
            return -1;

          //then we do normal check if a < b or a > b
          else if(a[index] < b[index])
            return -1;

          else if(a[index] > b[index])
            return 1;
        }
      }

      //same as above but now with b
      else if(a.length > b.length) {
        //loop through a and check b array
        for(int index = 0; index < a.length; ++index) {
          if(index == b.length - 1 && a[index] > b[index])
            return 1;

          else if(index == b.length - 1 && a[index] < b[index])
            return -1;

          else if(index > b.length - 1)
            return 1;

          else if(a[index] < b[index])
            return -1;

          else if(a[index] > b[index])
            return 1;
        }
      }

      //now if all checks fail with the first char and both sizes are equal
      //then loop and check each index
      for (int index = 0; index < a.length; ++index) {
        if (a[index] < b[index])
          return -1;

        else if(a[index] > b[index])
          return 1;
      }

      //return 0 at the end if we loop through everything with no difference
      return 0;*/

      //now with checking with array compare function
      String stringA = new String(a);
      String stringB = new String(b);

      if(stringA.compareTo(stringB) < 0)
        return -1;

      else if(stringA.compareTo(stringB) > 0)
        return 1;

      return 0;
    }
}
