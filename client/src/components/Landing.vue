<template>
  <div class="d-flex justify-content-center flex-wrap">
    <h1 class="display-4 text-center mt-3 text-primary fadeInDown" v-wow>
      Адміністративна панель<br />
      аптечної мережі<br />
      <span class="text-danger">Alex Pharmacy</span>
    </h1>

    <div class="w-100"></div>

    <router-link
      to="/cities"
      tag="button"
      class="btn btn-success rounded-pill w-50 mt-4 mb-2 fadeInUp shiftRight"
      v-wow
    >
      <h3 class="m-0 landing-button-text">Міста</h3>
    </router-link>

    <div class="w-100" />

    <router-link
      to="/manufacturers"
      tag="button"
      class="btn btn-success rounded-pill w-50 my-2 fadeInUp shiftLeft"
      v-wow
      data-wow-delay="0.1s"
    >
      <h3 class="m-0 landing-button-text">Виробники</h3>
    </router-link>

    <div class="w-100" />

    <router-link
      to="/clients"
      tag="button"
      class="btn btn-success rounded-pill w-50 my-2 fadeInUp shiftRight"
      v-wow
      data-wow-delay="0.2s"
    >
      <h3 class="m-0 landing-button-text">Клієнти</h3>
    </router-link>

    <div class="w-100" />

    <router-link
      to="/drugs"
      tag="button"
      class="btn btn-success rounded-pill w-50 my-2 fadeInUp shiftLeft"
      v-wow
      data-wow-delay="0.3s"
    >
      <h3 class="m-0 landing-button-text">Препарати</h3>
    </router-link>

    <div class="w-100" />

    <router-link
      to="/diseases"
      tag="button"
      class="btn btn-success rounded-pill w-50 my-2 fadeInUp shiftRight"
      v-wow
      data-wow-delay="0.4s"
    >
      <h3 class="m-0 landing-button-text">Хвороби</h3>
    </router-link>

    <div class="w-100" />

    <router-link
      to="/baskets"
      tag="button"
      class="btn btn-success rounded-pill w-50 my-2 fadeInUp shiftLeft"
      v-wow
      data-wow-delay="0.5s"
    >
      <h3 class="m-0 landing-button-text">Кошики</h3>
    </router-link>

    <div class="w-100" />

    <router-link
      to="/requests"
      tag="button"
      class="btn btn-danger rounded-pill w-50 my-2 fadeInUp shiftRight"
      v-wow
      data-wow-delay="0.6s"
    >
      <h3 class="m-0 landing-button-text">Запити</h3>
    </router-link>
  </div>
</template>

<script>
export default {
  name: "Landing"
};
</script>

<style lang="css">
@import "../styles/gradient.css";
@import "../styles/animate.css";
@import "../styles/menuButtons.css";
</style>
