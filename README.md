# 선택정렬

- 전체 배열에서 가장 작은요소를 찾고 그 요소를 배열의 첫 번째 요소와 교환.
- 그 후 A의 두번째 요소부터 마지막 요소까지 확인하여 가장 작은 요소를 찾은 후 <br/>
그 요소를 두 번째 요소와 교환
- n-1 번을 반복.

# 삽입 정렬 

### 9 7 8 2 5 
-  7이 9보다 작으므로 7을 9앞에 삽입 
### 7 9 8 2 5 
-  7 9 는 했고 9,8을 비교

### 7 8 9 2 5 
- 7 8 9 는 정렬되어있고 2는 앞에있는 모든 요소보다 작으므로 7앞에 삽입 

### 2 7 8 9 5 
- 5 또한 앞에 index들보다는 작고 2보단 크므로 2 앞에 5를 삽입

### 2 5 7 8 9 완료 


# 힙정렬 

### 트리
- 부모노드 : 자기 자신(노드)과 연결 된 노드 중 자신보다 높은 노드를 의미
- 자식노드 : 자기 자신 과 연결 된 노드 중 자신보다 낮은 노드를 의미 
- 루트노드 : 일명 뿌리 노드라고 하며 루트 노드는 하나의 트리에선 하나밖에 존재하지 않고, 부모노드가 없다.
- 단말노드 : 리프 노드라고도 불리며 자식 노드가 없는 노드를 의미함 .
- 내부노드 : 단말 노드가 아닌 노드 
- 형제 노드 : 부모가 같은 노드를 말한다 
- 깊이 : 특정 노드에 도달하기 위해 거쳐가야 하는 '간선의 개수'를 의미 
- 레벨 : 특정 깊이에 있는 노드들의 집합을 말함. 
- 차수 : 특정 노드가 하위 (자식) 노드와 연결 된 개수 


### 이진트리 
> 모든 노드의 최대 차수를 2로 제한함. 즉 노드는 자식노드를 최대 2개까지 밖에 못갖는것을 '이진트리'라고함


### 완전 이진트리 
- '마지막 레벨' 을 제외한 모든 노드가 채워져있으면서 모든 노드 (=사실상 마지막 레벨의 노드들)가 
왼쪽부터 채워져있어야함.


