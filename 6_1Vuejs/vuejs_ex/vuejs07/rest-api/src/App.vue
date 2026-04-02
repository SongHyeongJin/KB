<script setup>
import axios from 'axios';
const getData = () => {
  axios
    .get('/api/data')
    .then((response) => {
      console.log(response.data);
    })
    .catch((error) => {
      console.log(`데이터를 가져오던 중 에러 발생: `, error);
    });
};
// const postData = () => {
//   axios
//     .post('/api/data', { name: `newData`, description: `sample data` })
//     .then((response) => {
//       console.log(response.data);
//     })
//     .catch((error) => {
//       console.log(`데이터를 추가하던 중 에러 발생: `, error);
//     });
// };
const postData = async () => {
  try {
    const response = await axios.post('/api/data', {
      name: `testData`,
      description: `test data`,
    });
    console.log('등록 성공', response.data);
    alert('등록이 완료되었습니다.');
  } catch (error) {
    console.error('등록 실패', error);
    alert('등록 중 문제가 발생했습니다.');
  }
};
</script>

<template>
  <button type="button" @click="postData">POST</button><br />
  <button type="button" @click="getData">GET</button><br />
  <button type="button">PUT</button><br />
  <button type="button">PATCH</button><br />
</template>

<style scoped></style>
