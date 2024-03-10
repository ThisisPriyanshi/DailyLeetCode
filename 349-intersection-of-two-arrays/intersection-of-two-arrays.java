class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> comp = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if(nums1.length > nums2.length)
        {
            for(int i = 0; i < nums1.length; i++)
            {
                comp.add(nums1[i]);
            }

            for(int j = 0; j < nums2.length; j++)
            {
                if(comp.contains(nums2[j]) && !result.contains(nums2[j]))
                {
                    result.add(nums2[j]);
                }
            }
        }
        else 
        {
           for(int i = 0; i < nums2.length; i++)
            {
                comp.add(nums2[i]);
            } 

            for(int j = 0; j < nums1.length; j++)
            {
                if(comp.contains(nums1[j]) && !result.contains(nums1[j]))
                {
                    result.add(nums1[j]);
                }
            }
        }

        int size = result.size();
        int[] resArray = new int[size];
        for(int k = 0; k < size; k++)
        {
            resArray[k] = result.get(k);
        }
        
        return resArray;
    }
}