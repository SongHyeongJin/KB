<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'
import BoardListItem from '@/components/BoardListItem.vue'

const boards = ref([])

const load = async () => {
  try {
    // TODO-03
    // 게시글 목록을 조회하는 axios 코드를 완성하세요.
    // 힌트: GET /api/boards
    const response = await axios.get('/api/boards')

    // TODO-04
    // axios 응답 데이터로 boards를 세팅하세요.
    boards.value = response.data
  } catch (error) {
    console.error('목록 조회 실패:', error)
  }
}

onMounted(load)
</script>

<template>
  <section>
    <div class="page-header">
      <h2>게시글 목록</h2>
      <RouterLink to="/create" class="write-button">글쓰기</RouterLink>
    </div>

    <p class="guide">
      아래 TODO를 완성하면서 v-for, :key, props 바인딩을 함께 점검하세요.
    </p>

    <!-- TODO-05
         v-for를 사용하여 boards를 출력하세요.
         각 반복 항목에는 반드시 :key="board.id"를 적용하세요.
         BoardListItem에 :board="board"를 전달하세요.
    -->
    <BoardListItem
      v-for="board in boards"
      :key="board.id"
      :board="board"
    />

    <p v-if="boards.length === 0" class="empty-message">
      등록된 게시글이 없습니다.
    </p>
  </section>
</template>

<style scoped>
.page-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.write-button {
  padding: 10px 14px;
  background: #2563eb;
  color: white;
  text-decoration: none;
  border-radius: 8px;
}
.guide {
  margin: 16px 0;
  color: #6b7280;
}
.empty-message {
  margin-top: 20px;
  color: #9ca3af;
}
</style>
