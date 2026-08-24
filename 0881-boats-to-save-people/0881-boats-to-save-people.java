class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int i = 0;
        int r = people.length - 1;
        int boats = 0;

        while(i <= r) {

            if(people[i] + people[r] <= limit) {
                i++;
                r--;
            } else {
                r--;
            }

            boats++;
        }

        return boats;
    }
}