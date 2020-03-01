
const routes = [
  {
    path: '/',
    component: () => import('layouts/MainLayout.vue'),
    children: [
      { path: '', component: () => import('pages/Index.vue') },
      { path: '/events', component: () => import('pages/Events.vue') },
      { path: '/ranks', component: () => import('pages/Ranks.vue') },
      { path: '/pricing', component: () => import('pages/Pricing.vue') },
      { path: '/signup', component: () => import('pages/Signup.vue') },
    ],
  },
];

// Always leave this as last one
if (process.env.MODE !== 'ssr') {
  routes.push({
    path: '*',
    component: () => import('pages/Error404.vue'),
  });
}

export default routes;
