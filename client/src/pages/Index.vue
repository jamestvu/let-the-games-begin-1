<template>
  <q-page>
      <q-carousel
        arrows
        animated
        v-model="slide"
        fullscreen
        :autoplay="8000"
        infinite
      >
        <q-carousel-slide name="first" img-src="../assets/images/front.jpeg">
          <div class="absolute-bottom custom-caption">
            <div class="text-h2">Video Games</div>
            <div class="text-h5">Who is the best Super Smash Bros Player?</div>
          </div>
        </q-carousel-slide>
        <q-carousel-slide name="second" img-src="../assets/images/mtg.jpg">
          <div class="absolute-bottom custom-caption">
            <div class="text-h2">Card Games</div>
            <div class="text-h5">Battle it out with Magic The Gathering</div>
          </div>
        </q-carousel-slide>
        <q-carousel-slide name="third" img-src="../assets/images/chess.jpeg">
          <div class="absolute-bottom custom-caption">
            <div class="text-h2">Board Games</div>
            <div class="text-h5">Are you the best Chess player?</div>
          </div>
        </q-carousel-slide>
      </q-carousel>
  </q-page>
</template>

<script>
export default {
  name: 'PageIndex',
  data() {
    return {
      slide: 'first',
      text: '',
    };
  },
};
</script>

<style>
  .custom-caption {
    text-align: center;
    padding: 40px;
    color: white;
    background-color: rgba(0, 0, 0, .6);
  }
</style>
