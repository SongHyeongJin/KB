<script>
import FirstChild from './components/FirstChild.vue';
<<<<<<< HEAD

=======
>>>>>>> 259cbabf4b327fba3eed75a6ba1de84659df2a79
export default {
  //Options API
  components: {
    FirstChild,
  },
  data() {
    return {
      visible: true,
    };
  },
<<<<<<< HEAD
=======

>>>>>>> 259cbabf4b327fba3eed75a6ba1de84659df2a79
  beforeCreate() {
    console.log('1');
  },
  created() {
    setTimeout(() => {
      this.visible = false;
    }, 3000);
  },
  beforeMount() {
    console.log('3');
  },
  mounted() {
    console.log('4');
  },
  beforeUpdate() {
    console.log('5');
  },
  updated() {
    console.log('6');
  },
};
</script>
<template>
  <FirstChild v-if="visible" />
</template>
