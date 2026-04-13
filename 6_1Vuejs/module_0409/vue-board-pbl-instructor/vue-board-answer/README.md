# Vue3 Board PBL - 교수자용 정답본

이 프로젝트는 **Vue.js를 처음 배우는 대학생 대상 게시판 PBL 실습**의 교수자용 정답본입니다.

학생용 TODO 프로젝트와 동일한 구조를 유지하면서, 다음을 제공합니다.

- 목록 / 상세 / 등록 / 수정 / 삭제 기능 완성본
- `json-server` + `axios` + `vue-router` 연결 정답
- 교수자가 수업 전에 직접 실행해 볼 수 있는 기준 프로젝트
- 체크리스트 27개에 대한 정답 매핑 문서
- 파일별 해설 및 수업 포인트 문서

---

## 기능 범위

- 게시글 목록 조회
- 게시글 상세 조회
- 게시글 등록
- 게시글 수정
- 게시글 삭제

---

## 실행 방법

### 1) 패키지 설치
```bash
npm install
```

### 2) json-server 실행
```bash
npx json-server --watch db.json --port 3000
```

또는

```bash
npm run api
```

### 3) Vue 개발 서버 실행
```bash
npm run dev
```

---

## 수업 운영 팁

1. 먼저 학생용 TODO 버전으로 과제를 수행하게 합니다.
2. 학생이 막히는 지점을 `proxy → router → axios → ref → route.params.id` 순서로 점검하게 합니다.
3. 수업 마무리에서는 이 정답본과 비교하며 다음을 설명하게 합니다.
   - 왜 `/api` 프록시가 필요한가
   - 왜 `boards.value = response.data`처럼 `.value`가 필요한가
   - 왜 `route`는 읽기, `router`는 이동에 쓰는가
   - 왜 삭제/등록/수정 뒤에 화면 이동이 필요한가

---

## 체크리스트 대응

학생 체크리스트 27개는 `docs/answer-guide.md`에서 항목별로 정답 위치를 바로 확인할 수 있습니다.

---

## 프로젝트 구조

```bash
vue-board-pbl-instructor/
├─ db.json
├─ package.json
├─ vite.config.js
├─ src/
│  ├─ main.js
│  ├─ App.vue
│  ├─ router/
│  │  └─ index.js
│  ├─ components/
│  │  └─ BoardListItem.vue
│  └─ pages/
│     ├─ BoardList.vue
│     ├─ BoardDetail.vue
│     ├─ BoardCreate.vue
│     └─ BoardEdit.vue
└─ docs/
   ├─ teacher-guide.md
   ├─ answer-guide.md
   └─ file-explanation.md
```
