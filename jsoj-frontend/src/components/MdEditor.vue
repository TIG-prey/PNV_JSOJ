<template>
  <Editor :value="value" :plugins="plugins" @change="handleChange" />
</template>

<script setup lang="ts">
import gfm from "@bytemd/plugin-gfm";
import highlight from "@bytemd/plugin-highlight";
import { Editor } from "@bytemd/vue-next";
import { withDefaults, defineProps } from "vue";

/**
 * 定义组件属性类型，外层传入数据
 */
interface Props {
  value: string;
  handleChange: (v: string) => void;
}

const plugins = [gfm(), highlight()];

/**
 * 属性默认值
 */
const props = withDefaults(defineProps<Props>(), {
  value: () => "",
  handleChange: (v: string) => {
    console.log(v);
    return "";
  },
});
</script>

<style scoped></style>
