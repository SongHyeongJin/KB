# 체크리스트

## 1. 서버 및 환경 설정

1. `db.json` 준비 여부 → `db.json`
2. `json-server` 실행 여부 → `README.md`, `package.json`의 `api` 스크립트
3. 필요한 모듈 import → 각 `.vue` 파일 상단 import 구문
4. `vue-router` 모듈 설정 → `src/router/index.js`, `src/main.js`
5. proxy 설정 → `vite.config.js`
6. 페이지 컴포넌트 import → `src/router/index.js`
7. 라우터 항목 설정 → `src/router/index.js`의 `routes`

## 2. 목록 페이지

8. `boards` 데이터 정의 → `src/pages/BoardList.vue`
9. axios 호출문 → `axios.get('/api/boards')`
10. axios 응답으로 `boards` 설정 → `boards.value = response.data`
11. `boards` 프로퍼티 정의 → `const boards = ref([])`
12. `v-for` 사용 → `<BoardListItem v-for="board in boards" ... />`
13. `:key` 바인딩 → `:key="board.id"`
14. `:board` 바인딩 → `:board="board"`

## 3. 상세 페이지

15. `router` 설정 → `const router = useRouter()`
16. `currentRoute` 설정 → `computed(() => route.fullPath)`
17. 파라미터 id 추출 → `const id = route.params.id`
18. `board` 데이터 정의 → `const board = ref({...})`
19. `load()`의 axios 호출 → `axios.get(`/api/boards/${id}`)`
20. axios 응답으로 `board` 설정 → `board.value = response.data`
21. `back()` 정의 → `router.push('/')`

## 4. 등록 페이지

22. `router` 설정 → `const router = useRouter()`
23. `board` 데이터 정의 → `const board = ref({...})`
24. `submit()`의 axios 호출 → `axios.post('/api/boards', {...})`
25. 등록 완료 후 목록 이동 → `router.push('/')`
26. `back()` 호출 시 목록 이동 → `router.push('/')`
27. 이벤트 핸들러 등록 → `@click="submit"`, `@click="back"`

## 5. 수정/삭제 기능

- 수정 기능 → `src/pages/BoardEdit.vue`
- 삭제 기능 → `src/pages/BoardDetail.vue`의 `remove()`
