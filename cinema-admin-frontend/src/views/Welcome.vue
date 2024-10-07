<!--
 * 欢迎页面
 *
 * @Author: ShanZhu
 * @Date: 2023-12-16
-->
<template>
    <div id="welcome">
        <div id="bk">欢迎访问电影院管理后台</div>
    </div>
</template>

<script>
export default {
    name: "Welcome",
};
</script>

<style scoped>
#welcome {
    background: url("../assets/welcome.jpg");
    background-size: cover;
    height: 100%;
    width: 100%;
}
#bk {
    color: rgba(67, 52, 166, 0.71);
    margin: 0;
    text-align: center;
    font-size: 36px;
    padding-top: 20px;
}
</style>
