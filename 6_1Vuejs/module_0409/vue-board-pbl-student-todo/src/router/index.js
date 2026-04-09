import { createRouter, createWebHistory } from 'vue-router';
import BoardList from '@/pages/BoardList.vue';
import BoardDetail from '@/pages/BoardDetail.vue';
import BoardCreate from '@/pages/BoardCreate.vue';
import BoardEdit from '@/pages/BoardEdit.vue';

const routes = [
  // TODO-02
  // 아래 라우터 설정을 읽고, 각 path / name / component가 무슨 역할인지 설명해 보세요.
  // 설명을 할 줄 안다면, 아래 라우터객체들을 주석처리하고 직접 하드코딩해 보세요
  { path: '/', name: 'board-list', component: BoardList },
  { path: '/create', name: 'board-create', component: BoardCreate },
  {
    path: '/detail/:id',
    name: 'board-detail',
    component: BoardDetail,
    props: true,
  },
  { path: '/edit/:id', name: 'board-edit', component: BoardEdit, props: true },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
