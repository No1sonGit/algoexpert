import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if (sequence.size() > array.size()) {
            return false;
        }

        int validCount = 0;
        int seqMarker = 0;

        for (Integer arrNum : array) {
            if (arrNum.equals(sequence.get(seqMarker))) {
                seqMarker++;
                validCount++;
            }

            if (validCount == sequence.size()) {
                return true;
            }
        }

        return false;
    }

}
