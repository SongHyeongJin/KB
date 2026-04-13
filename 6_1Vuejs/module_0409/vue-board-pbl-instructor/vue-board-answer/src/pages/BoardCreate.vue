<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()

const board = ref({
  title: '',
  content: '',
  writer: ''
})

const submit = async () => {
  try {
    await axios.post('/api/boards', {
      ...board.value,
      createdAt: new Date().toISOString().slice(0, 10)
    })

    router.push('/')
  } catch (error) {
    console.error('등록 실패:', error)
  }
}

const back = () => {
  router.push('/')
}
</script>

<template>
  <section>
    <h2>게시글 등록</h2>

    <div class="form-group">
      <label for="title">제목</label>
      <input id="title" v-model="board.title" type="text" />
    </div>

    <div class="form-group">
      <label for="writer">작성자</label>
      <input id="writer" v-model="board.writer" type="text" />
    </div>

    <div class="form-group">
      <label for="content">내용</label>
      <textarea id="content" v-model="board.content" rows="8"></textarea>
    </div>

    <div class="button-row">
      <button @click="submit">등록</button>
      <button @click="back">취소</button>
    </div>
  </section>
</template>

<style scoped>
.form-group {
  display: flex;
  flex-direction: column;
  gap: 8px;
  margin-bottom: 16px;
}
input, textarea {
  padding: 10px 12px;
  border: 1px solid #d1d5db;
  border-radius: 8px;
}
.button-row {
  display: flex;
  gap: 10px;
}
button {
  border: none;
  padding: 10px 14px;
  border-radius: 8px;
  cursor: pointer;
}
</style>
