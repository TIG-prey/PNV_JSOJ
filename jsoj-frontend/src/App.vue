<template>
  <div id="app">
    <BasicLayout />
  </div>
</template>

<style>
#app {
}
</style>
<script setup lang="ts">
import BasicLayout from "@/layouts/BasicLayout.vue";

import { onMounted } from "vue";

// 全局入口
const doInit = () => {
  console.log("全局入口app");
};

onMounted(() => {
  doInit();
});
</script>
