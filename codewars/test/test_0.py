from src.sort_the_odd import sort_array
import unittest

class CodewarsTest(unittest.TestCase):
    def test_sort_the_odd(self):
        self.assertEqual(sort_array([]), [])

if __name__ == '__main__':
    unittest.main(verbosity=2)