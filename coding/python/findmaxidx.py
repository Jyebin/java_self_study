def find_max_idx(a):
    n = len(a)
    max_idx = 0
    for i in range(1,n):
        if a[i] > a[max_idx]:
            max_idx = i
    return max_idx
    
    v = [17, 92, 18, 33, 58, 7, 33, 42]
    print(find_max_idx(v))