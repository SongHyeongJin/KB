import { createRouter, createWebHistory } from 'vue-router';

import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import Videos from '@/pages/Videos.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    // 홈 페이지
    { path: '/', name: 'home', component: Home },
    // 어바웃 페이지
    { path: '/about', name: 'about', component: About },
    // 멤버 페이지
    { path: '/members', name: 'members', component: Members },
    // 비디오 페이지
    { path: '/videos', name: 'videos', component: Videos },
  ],
});
//다른파일(main.js)에서 사용할 수 있도록 export
export default router;
