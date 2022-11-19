package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ContainsDuplicateTest {
    @Test
    void containDuplicate() {
        int[] nums1 = new int[]{1,2,3,1};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicate(nums1));

        int[] nums2 = new int[]{1,2,3};
        Assertions.assertFalse(ContainsDuplicate.containsDuplicate(nums2));

        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicate(nums3));
    }

    @Test
    void containDuplicateWithHashSet() {
        int[] nums1 = new int[]{1,2,3,1};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithHashSet(nums1));

        int[] nums2 = new int[]{1,2,3};
        Assertions.assertFalse(ContainsDuplicate.containsDuplicateWithHashSet(nums2));

        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithHashSet(nums3));
    }
}
