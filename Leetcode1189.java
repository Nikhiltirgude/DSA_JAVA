 int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);

        int ans = b;

        if (a < ans) ans = a;
        if (l < ans) ans = l;
        if (o < ans) ans = o;
        if (n < ans) ans = n;

        return ans;