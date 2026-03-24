<template>
<<<<<<< HEAD
    
  <div>
        
    <h2>박스 너비 측정</h2>
        
=======
  <div>
    <h2>박스 너비 측정</h2>
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
    <div
      ref="box"
      style="width: 200px; height: 100px; background: skyblue"
    ></div>

<<<<<<< HEAD
        
=======
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
    <p>created 결과: {{ createdWidth }}</p>
        
    <p>mounted 결과: {{ mountedWidth }}</p>
      
  </div>
</template>

<script>
export default {
  data() {
    return {
      createdWidth: 0,
      mountedWidth: 0,
    };
  },
  created() {
<<<<<<< HEAD
    // TODO: box width 측정 시도
    console.log('created: ', this.$refs.box);
=======
    console.log('created:', this.$refs.box);
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
    this.createdWidth = this.$refs.box ? this.$refs.box.offsetWidth : 0;
  },
  mounted() {
    // TODO: box width 측정
<<<<<<< HEAD
    // DOM 존재
    console.log('mounted: ', this.$refs.box);
=======
    //DOM 존재
    console.log('mounted:', this.$refs.box);
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
    this.mountedWidth = this.$refs.box.offsetWidth;
  },
};
</script>
