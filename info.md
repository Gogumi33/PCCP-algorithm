DFS 는 반드시 코드 2개는 외워두는게 좋다.

하나는 재귀
하나는 00

깊이 우선 탐색 : DFS(Depth-First Search)
한 정점에서 인접한 모든 정점을 방문하되, 각 인접 정점을 기준으로 깊이 우선 탐색을 끝낸 후 다음 정점으로 진행
완전히 끝까지 경우의 수를 탐색할 때

arrow_upwardarrow_downwardlinkcommenteditdeletemore_vert
너비 우선 탐색 : BFS(Breadth First Search)
한 정점에서 인접한 모든 정점을 방문하고, 방문한 각 인접 정정을 기준으로 또다시 너비 우선 탐색
최단 경로, 최소 이동 횟수


# 던전문제
def solution(k, dungeons):
    maximum = -1
    N = len(dungeons)
    visited = [False] * N
    def dfs(n, hp):
        nonlocal maximum # 찾아보기... 현재 함수 밖에 변수 쓰겠다.
        if n > maximum: # 갱신
            maximum = n
        # 재귀탐색---효율성
        # 탈출조건 : 재귀탐색 종료
        if n == N or hp <= 0: 
            return 
        for d_idx in range(N):
            visited[d_idx] = True
            # 해가 될 조건
            if hp >= dungeons[d_idx][0]:
                dfs(n+1, hp - dungeons[d_idx][1])
            visited[d_idx] = False
    
    dfs(0, k)
    return maximum
k = 80
dungeons = [[80,20],[50,40],[30,10]]
solution(k, dungeons)
