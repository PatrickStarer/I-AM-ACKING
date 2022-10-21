package MedianfTwoSortedArrays;

/**
 * 要求时间复杂度为log(m+n)
 */
public class Test {


    public static void main(String[] args) {
        int[]a ={1,2,3,4,5};
        int[] b = {3,4,5,6,7};
        findMedianSortedArrays(a,b);

    }



    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length, length2 = nums2.length;
        int totalLength = length1 + length2;
        if (totalLength % 2 == 1) {
            int midIndex = totalLength / 2;
            double median = getKthElement(nums1, nums2, midIndex + 1);
            return median;
        } else {
            int midIndex1 = totalLength / 2 - 1, midIndex2 = totalLength / 2;
            double median = (getKthElement(nums1, nums2, midIndex1 + 1) +
                    getKthElement(nums1, nums2, midIndex2 + 1)) / 2.0;
            return median;
        }
    }

    public static int getKthElement(int[] nums1, int[] nums2, int k) {
        int length1 = nums1.length, length2 = nums2.length;
        int index1 = 0, index2 = 0;
        while (true) {
            //这两种情况说明其中一个数组没有数值是中位数
            if (index1 == length1) {
                return nums2[index2 + k - 1];
            }
            if (index2 == length2) {
                return nums1[index1 + k - 1];
            }
            //k==1时循环结束
            //k表示要找这个组合数组的第k小的数，当k==1时，表示找到
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }
            int half = k / 2;
            //min:如果数组长度差距过大，会溢出，所以索引的最大为length-1
            int newIndex1 = Math.min(index1 + half, length1) - 1;
            int newIndex2 = Math.min(index2 + half, length2) - 1;

            int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
            if (pivot1 <= pivot2) {
                //核中核
                //说明前newindex1+1个已经被排除了，只需要找到剩下数组中的k-(newIndex1-idex1+1）个
                //说明前三个已经被排除了,只需要找到剩下数组中第7-3个
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;

            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;

            }
        }
    }
}
