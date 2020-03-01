<template>
  <q-layout view="hHh lpR fFf">
    <q-header elevated class="bg-primary text-white z-max" height-hint="98">
      <q-tabs align="left" indicator-color="transparent" class="navigation">
        <q-route-tab to="/" label="Let The Games Begin" />
        <q-route-tab to="/events" label="Events" />
        <q-route-tab to="/ranks" label="Ranks" />
        <q-route-tab to="/pricing" label="Pricing" />
        <q-route-tab to="/signup" label="Sign Up" />
      </q-tabs>
      <span class="login">
        <q-form @submit="onSubmit">
          <q-input dark dense standout input-class="text-right" class="input-text-padding" value="" label="USERNAME" />
          <q-input type="password" dark dense standout input-class="text-right" class="input-text-padding" value="" label="PASSWORD" />
          <q-btn type="submit" label="Login" class="bg-secondary login-btn" dense />
        </q-form>
      </span>
    </q-header>
    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>
<script>
export default {
  name: 'MainLayout',
  methods: {
    onSubmit() {
      console.log('hello');
    },
  },
};
</script>
<style>
  .login {
    display: inline-block;
    float: right;
  }
  .navigation {
    display: inline-block;
  }
  .login-btn {
    margin: 0 20px 8px 8px;
    padding: 0 20px 0 20px;
  }
  .input-text-padding {
    display: inline-block;
    padding: 4px 0 4px 0;
    margin: 2px 10px 2px 0;
  }
</style>
