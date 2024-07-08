public class union{
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,5,5,6};
        int[] nums2 = {2,5,6,7,8,8,9};
        int past= Integer.MIN_VALUE, i=0,j=0;

        while (i<nums1.length && j<nums2.length) {
            if(nums1[i] < nums2[j]){
                if(nums1[i]!=past){
                    System.out.print(nums1[i]+ " ");
                    past = nums1[i];
                }
                i++;
            }
            else if(nums1[i] > nums2[j]){
                if(nums2[j]!=past){
                    System.out.print(nums2[j]+" ");
                    past = nums2[j];
                }
                j++;
            }
            else{
                if (past!=nums1[i]){
                    System.out.print(nums1[i]+" ");
                    past = nums1[i];
                }
                i++;
                j++;
                    
            }
            
        }

        while(i!=nums1.length){
            if(nums1[i]!=past){
                System.out.print(nums1[i]+" ");
                past=nums1[i];
            }
            i++;
        }
        
        while(j!=nums2.length){
            if(nums2[j]!=past){
                System.out.print(nums2[j]+" ");
                past=nums2[j];
            }
            j++;
        }
        System.out.println();
    }
}