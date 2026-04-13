<script setup>
import { ref, onMounted, computed } from 'vue'
import { useRoute, useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()
const route = useRoute()

const currentRoute = computed(() => route.fullPath)

const board = ref({
  id: null,
  title: '',
  content: '',
  writer: '',
  createdAt: ''
})

const load = async () => {
  try {
    const id = route.params.id
    const response = await axios.get(`/api/boards/${id}`)
    board.value = response.data
  } catch (error) {
    console.error('상세 조회 실패:', error)
  }
}

const moveEdit = () => {
  router.push(`/edit/${board.value.id}`)
}

const remove = async () => {
  try {
    await axios.delete(`/api/boards/${board.value.id}`)
    router.push('/')
  } catch (error) {
    console.error('삭제 실패:', error)
  }
}

const back = () => {
  router.push('/')
}

onMounted(load)
</script>

<template>
  <section class="detail-page">
    <h2>게시글 상세</h2>

    <p class="route-check">
      현재 경로 확인: {{ currentRoute }}
    </p>

    <div class="detail-box">
      <h3>{{ board.title }}</h3>
      <p class="meta">
        작성자: {{ board.writer }} / 작성일: {{ board.createdAt }}
      </p>
      <p class="content">{{ board.content }}</p>
    </div>

    <div class="button-row">
      <button @click="moveEdit">수정</button>
      <button @click="remove">삭제</button>
      <button @click="back">목록으로</button>
    </div>
  </section>
</template>

<style scoped>
.detail-box {
  border: 1px solid #e5e7eb;
  border-radius: 12px;
  padding: 20px;
  margin: 16px 0;
}
.meta {
  color: #6b7280;
  font-size: 14px;
}
.content {
  white-space: pre-wrap;
  margin-top: 16px;
  line-height: 1.6;
}
.button-row {
  display: flex;
  gap: 10px;
}
.button-row button {
  border: none;
  padding: 10px 14px;
  border-radius: 8px;
  cursor: pointer;
}
.route-check {
  color: #2563eb;
}
</style>
