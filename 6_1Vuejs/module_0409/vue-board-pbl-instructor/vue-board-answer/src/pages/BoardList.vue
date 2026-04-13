<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'
import BoardListItem from '@/components/BoardListItem.vue'

const boards = ref([])

const load = async () => {
  try {
    const response = await axios.get('/api/boards')
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
      목록 페이지에서는 boards 상태, axios GET 요청, v-for, :key, props 전달을 함께 확인합니다.
    </p>

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
