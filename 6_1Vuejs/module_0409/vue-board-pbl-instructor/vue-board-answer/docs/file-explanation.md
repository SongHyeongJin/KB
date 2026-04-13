# 파일 설명 문서

## `db.json`

`json-server`가 읽는 가짜 데이터베이스입니다. `boards` 배열 이름이 곧 REST 자원명이 되어 `/boards` 경로로 연결됩니다.

## `vite.config.js`

Vite 개발 서버 설정입니다. `/api` 요청을 `http://localhost:3000`으로 프록시하고, `rewrite`로 `/api` 접두사를 제거합니다.

## `src/main.js`

Vue 앱의 진입점입니다. `App.vue`를 마운트하고 `router`를 연결합니다.

## `src/App.vue`

공통 레이아웃입니다. 상단 메뉴와 `RouterView`를 배치하여 페이지 전환의 뼈대를 제공합니다.

## `src/router/index.js`

게시판 프로젝트의 라우팅 규칙입니다.

- `/` 목록
- `/create` 등록
- `/detail/:id` 상세
- `/edit/:id` 수정

## `src/components/BoardListItem.vue`

목록에서 게시글 1개를 표시하는 재사용 컴포넌트입니다. `props`로 `board`를 받아 제목과 작성자 정보를 출력합니다.

## `src/pages/BoardList.vue`

전체 게시글 목록을 불러옵니다. `onMounted()` 시점에 `GET /api/boards`를 호출하고, `v-for`로 리스트를 렌더링합니다.

## `src/pages/BoardDetail.vue`

URL 파라미터 `id`를 받아 특정 게시글을 조회합니다. 같은 파일 안에서 수정 페이지 이동, 삭제, 목록 복귀까지 처리합니다.

## `src/pages/BoardCreate.vue`

새 게시글을 작성합니다. `v-model`로 입력값을 상태와 연결하고, `POST /api/boards`로 저장 후 목록으로 돌아갑니다.

## `src/pages/BoardEdit.vue`

수정 대상 글을 먼저 불러온 뒤 입력창에 채웁니다. 이후 `PUT /api/boards/:id`로 전체 데이터를 갱신하고 상세 화면으로 이동합니다.
