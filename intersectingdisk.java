int[] westEnding = new int[A.length];
        int[] eastEnding = new int[A.length];

        for (int i=0; i<A.length; i++) {
            if (i-A[i]>=0) eastEnding[i-A[i]]++; else eastEnding[0]++;
            if ((long)i+A[i]<A.length) westEnding[i+A[i]]++; else westEnding[A.length-1]++;
        }

        long result = 0; //long to contain the case of 50k*50k. codility doesn't test for this.
        int wests = 0;
        int easts = 0;
        for (int i=0; i<A.length; i++) {

            int balance = easts*wests; //these are calculated elsewhere

            wests++;
            easts+=eastEnding[i];

            result += (long) easts*wests - balance - 1; // 1 stands for the self-intersection
            if (result>10000000) return -1;

            easts--;
            wests-= westEnding[i];
        }

        return (int) result;