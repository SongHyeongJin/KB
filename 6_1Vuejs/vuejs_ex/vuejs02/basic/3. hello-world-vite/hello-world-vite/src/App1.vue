<<<<<<< HEAD
<!-- <template>
  <img alt="Vue logo" src="./assets/logo.png" />
  <HelloWorld msg="Hello Vue 3.0 + Vite" />
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld,
  },
}
</script> -->
=======
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
<script>
export default {
  data() {
    return {
      username: '',
    };
  },
  methods: {
    fetchUser() {
<<<<<<< HEAD
      //사용자 이름  설정 this.fetchUser() 호출 위치
      this.username = '송형진';
      console.log('데이터 로딩 완료!');
    },
  },
  //created() : 데이터 초기화 시점 //API 호출 시점
=======
      //사용자 이름 설정 this.fechUser() 호출 위치fetchUser
      this.username = '서유미';
      console.log('데이터 로딩 완료!');
    },
  },
  //created() : 데이터 초기화 시점  //API 호출 시점
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
  created() {
    console.log('컴포넌트 생성됨');
    this.fetchUser();
  },
<<<<<<< HEAD
  //mounted() : DOM 접근 가능 시점 //chart, DOM제어
=======
  //mounted() : DOM 접근 가능 시점  //chart ,DOM 제어

>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
  mounted() {
    console.log('DOM 렌더링 완료');
  },
};
</script>
<template>
  <div>
    <h2>사용자 정보</h2>
    <p>{{ username }}</p>
    <button @click="fetchUser">다시 불러오기</button>
  </div>
</template>
