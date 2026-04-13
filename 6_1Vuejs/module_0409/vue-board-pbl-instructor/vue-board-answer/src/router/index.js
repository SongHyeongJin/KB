import { createRouter, createWebHistory } from 'vue-router'
import BoardList from '@/pages/BoardList.vue'
import BoardDetail from '@/pages/BoardDetail.vue'
import BoardCreate from '@/pages/BoardCreate.vue'
import BoardEdit from '@/pages/BoardEdit.vue'

const routes = [
  { path: '/', name: 'board-list', component: BoardList },
  { path: '/create', name: 'board-create', component: BoardCreate },
  { path: '/detail/:id', name: 'board-detail', component: BoardDetail, props: true },
  { path: '/edit/:id', name: 'board-edit', component: BoardEdit, props: true }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
